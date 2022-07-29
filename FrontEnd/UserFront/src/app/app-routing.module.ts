import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { AddParentComponent } from './Parent/add-parent/add-parent.component';
import { ListParentComponent } from './Parent/list-parent/list-parent.component';

const routes: Routes = [
  { path: '', redirectTo: 'home', pathMatch: 'full' },
  {
    path: 'parent-management',
    children: [
      { path: 'add-parent', component:AddParentComponent },
      { path: 'list-parent', component:ListParentComponent }
      
    ]
  }


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
