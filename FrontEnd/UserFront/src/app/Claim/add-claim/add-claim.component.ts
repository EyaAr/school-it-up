import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from "@angular/forms";
import { ClaimService } from 'src/app/services/claim.service';
import { Claim} from 'src/app/models/claim.model';
import { Router } from '@angular/router';


@Component({
  selector: 'app-add-claim',
  templateUrl: './add-claim.component.html',
  styleUrls: ['./add-claim.component.css']
})
export class AddClaimComponent implements OnInit {
  addClaimForm!: FormGroup;
  ClaimToAdd !:Claim;

  constructor(private ClaimService:ClaimService, private Router:Router) { }

  ngOnInit(): void {
    this.addClaimForm= new FormGroup({
      idClaim:new FormControl('',[Validators.required]),
      subject:new FormControl('',[Validators.required]),
      description:new FormControl('',[Validators.required]),
      createdAt:new FormControl('',[Validators.required]),
      type:new FormControl('',[Validators.required])
    });
    this.ClaimToAdd=new Claim();
  }

  addClaim(){
    this.addClaimForm.reset();
  }
}
