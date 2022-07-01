import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './component/header/header.component';
import { FooterComponent } from './component/footer/footer.component';
import { NavigationComponent } from './component/navigation/navigation.component';
import { CustomerListComponent } from './component/customer/customer-list/customer-list.component';
import { CustomerCreateComponent } from './component/customer/customer-create/customer-create.component';
import { CustomerEditComponent } from './component/customer/customer-edit/customer-edit.component';
import { ContractListComponent } from './component/contract/contract-list/contract-list.component';
import { ContractCreateComponent } from './component/contract/contract-create/contract-create.component';
import { HomeComponent } from './component/home/home.component';
import { FacilityCreateComponent } from './component/facility/facility-create/facility-create.component';
import { FacilityEditComponent } from './component/facility/facility-edit/facility-edit.component';
import { FacilityListComponent } from './component/facility/facility-list/facility-list.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    NavigationComponent,
    CustomerListComponent,
    CustomerCreateComponent,
    CustomerEditComponent,
    ContractListComponent,
    ContractCreateComponent,
    HomeComponent,
    FacilityCreateComponent,
    FacilityEditComponent,
    FacilityListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
