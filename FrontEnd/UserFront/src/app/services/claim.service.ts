import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpHeaders, HttpClient } from '@angular/common/http';
import { Claim } from '../models/claim.model';

@Injectable({
  providedIn: 'root'
})
export class ClaimService {

  private ListClaimsUrl: string='http://localhost:8080/SpringMVC/claim/ListClaims'
  private getClaimUrl : string='http://localhost:8080/SpringMVC/claim/getClaim/'
  private addClaimUrl : string='http://localhost:8080/SpringMVC/claim/addClaim'
  private deleteClaimUrl : string='http://localhost:8080/SpringMVC/claim/deleteClaim/'


  constructor(private http: HttpClient) { }

  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json'
    })
  }

  ListClaims():Observable<Claim[]>{
    return this.http.get<Claim[]>(this.ListClaimsUrl)
  }

  getClaim(id: number):Observable<Claim>{
    return this.http.get<Claim>(this.getClaimUrl+ id, this.httpOptions)
  }

  addClaim(Claim: Claim): Observable<Claim>{
    return this.http.post<Claim>(this.addClaimUrl, Claim, this.httpOptions)
  } 
  
  deleteClaim(id:number):Observable<any> {
    return this.http.delete<any>(this.deleteClaimUrl + id);
  }
}
