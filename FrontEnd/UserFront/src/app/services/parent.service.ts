import { Injectable } from '@angular/core';

import { Observable } from 'rxjs';
import { HttpHeaders, HttpClient } from '@angular/common/http';
import { Parent } from '../models/parent.model';

@Injectable({
  providedIn: 'root'
})
export class ParentService {

  private ListParentsUrl: string='http://localhost:8080/SpringMVC/parent/ListParents'
  private getParentUrl: string='http://localhost:8080/SpringMVC/parent/getParent/'
  private addParentUrl: string='http://localhost:8080/SpringMVC/parent/addParent'
  private updateParentUrl: string='http://localhost:8080/SpringMVC/parent/updateParent'
  private deleteParentUrl: string='http://localhost:8080/SpringMVC/parent/deleteParent/'

  constructor(private http: HttpClient) { }

  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json'
    })
  }

  ListParents():Observable<Parent[]>{
    return this.http.get<Parent[]>(this.ListParentsUrl)
  }

  getParent(id: number): Observable<Parent> {
    return this.http.get<Parent>(this.getParentUrl + id, this.httpOptions)
  }

  addParent(Parent: Parent): Observable<Parent> {
    return this.http.post<Parent>(this.addParentUrl, Parent, this.httpOptions)
  }

  updateParent(Parent: Parent): Observable<Parent> {
    return this.http.put<Parent>(this.updateParentUrl, Parent, this.httpOptions);
  }

  deleteParent(id: number): Observable<any> {
    return this.http.delete<any>(this.deleteParentUrl + id);
  }



}
