import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from "@angular/forms";
import { ParentService } from 'src/app/services/parent.service';
import { Parent } from 'src/app/models/parent.model';
import { Router } from '@angular/router';

@Component({
  selector: 'app-add-parent',
  templateUrl: './add-parent.component.html',
  styleUrls: ['./add-parent.component.css']
})
export class AddParentComponent implements OnInit {
  addParentForm !: FormGroup;
  ParentToAdd !:Parent;
  
  

  constructor(private ParentService: ParentService, private Router:Router) { }

  ngOnInit(): void {
    this.addParentForm= new FormGroup({
      idParent:new FormControl('',[Validators.required]),
      firstName: new FormControl('',[Validators.required]),
      lastName: new FormControl('',[Validators.required]),
      mail: new FormControl('',Validators.pattern("^[a-zA-Z0-9._-]+@gmail.com")),
      cin:new FormControl('',Validators.minLength(8)),
      adresse:new FormControl,
      passe: new FormControl('',Validators.minLength(6)),
      etatCivil:new FormControl,
      phoneNb:new FormControl,
      birthDate:new FormControl('',Validators.pattern("^[0-9]{4}[-][0-9]{2}[-][0-9]{2}$")),
    });
    this.ParentToAdd=new Parent();
    
  }

  addParent() {
    this.addParentForm.reset();
  }


}

