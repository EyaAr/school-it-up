import { Component, OnInit } from '@angular/core';
import { Parent } from '../../models/parent.model';
import { ActivatedRoute, Router } from '@angular/router';
import { ParentService } from '../../services/parent.service';

@Component({
  selector: 'app-list-parent',
  templateUrl: './list-parent.component.html',
  styleUrls: ['./list-parent.component.css']
})
export class ListParentComponent implements OnInit {

  parents ?:Parent[];
  totalLength !: number
  page: number = 1
  searchQuery: any;
  p?:Parent;
  

  constructor(private ParentService:ParentService,private router: Router, private route: ActivatedRoute ) { }

  ngOnInit(): void {
    this.ParentService.ListParents().subscribe((res)=>{
      this.parents=res
    })
  }

  DeleteParent(id: number) {
    this.ParentService.deleteParent(id).subscribe(

      res=> {
        console.log("Parent deleted")
        this.ngOnInit()
      }
    )
  }

}
