import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { routes } from './app-routing.module';
import { AppComponent } from './app.component';

import { ListParentComponent } from './Parent/list-parent/list-parent.component';
import { AddParentComponent } from './Parent/add-parent/add-parent.component';
import { RouterModule } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { UpdateParentComponent } from './Parent/update-parent/update-parent.component';
import { ListClaimComponent } from './Claim/list-claim/list-claim.component';
import { AddClaimComponent } from './Claim/add-claim/add-claim.component';

@NgModule({
  declarations: [
    AppComponent,
    ListParentComponent,
    AddParentComponent,
    UpdateParentComponent,
    ListClaimComponent,
    AddClaimComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
   // AppRoutingModule
  RouterModule.forRoot(routes, { useHash: false, relativeLinkResolution: 'legacy' })
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
