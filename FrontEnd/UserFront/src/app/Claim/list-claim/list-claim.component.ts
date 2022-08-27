import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Claim } from 'src/app/models/claim.model';
import { ClaimService } from 'src/app/services/claim.service';

@Component({
  selector: 'app-list-claim',
  templateUrl: './list-claim.component.html',
  styleUrls: ['./list-claim.component.css']
})
export class ListClaimComponent implements OnInit {

  claims ?:Claim[];
  totalLength !: number
  page: number = 1
  searchQuery: any;
  c?:Claim;


  constructor(private ClaimService:ClaimService,private router: Router, private route: ActivatedRoute) { }

  ngOnInit(): void {
    this.ClaimService.ListClaims().subscribe((res)=>{
      this.claims=res
    })
  }

  DeleteClaim(id:number){
    this.ClaimService.deleteClaim(id).subscribe(
      res=>{
        console.log("Claim deleted")
        this.ngOnInit()
      }
    )
  }

}
