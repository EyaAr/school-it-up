import { Component, OnInit } from '@angular/core';
import { Parent } from 'src/app/models/Parent';
import { ParentService } from 'src/app/services/parent.service';

@Component({
  selector: 'app-list-parent',
  templateUrl: './list-parent.component.html',
  styleUrls: ['./list-parent.component.css']
})
export class ListParentComponent implements OnInit {

  parents !:Parent[];
  totalLength !: number
  page: number = 1
  searchQuery: any;

  constructor(private ParentService:ParentService) { }

  ngOnInit(): void {
    this.ParentService.ListParents()
  }

}
