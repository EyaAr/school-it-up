import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { AddParentComponent } from './Parent/add-parent/add-parent.component';
import { ListParentComponent } from './Parent/list-parent/list-parent.component';
import { UpdateParentComponent } from './Parent/update-parent/update-parent.component';

import { ListClaimComponent } from './Claim/list-claim/list-claim.component';
import { AddClaimComponent } from './Claim/add-claim/add-claim.component';

export const routes: Routes = [
  //{ path: '', redirectTo: 'home', pathMatch: 'full' },
 /* {
    path: 'parent-management',
    children: [
      { path: 'add-parent', component:AddParentComponent },
      
      
    ]
  },*/

  //parent
  { path: 'list-parent', component:ListParentComponent },
  { path: 'add-parent', component:AddParentComponent },
  { path: 'update-parent', component:UpdateParentComponent },


  //claim
  {path:'list-claim', component:ListClaimComponent},
  {path:'add-claim',component:AddClaimComponent}


];

/*@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }*/
