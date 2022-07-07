import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {DictionaryDetailPageComponent} from "./component/dictionary-detail-page/dictionary-detail-page.component";
import {DictionaryPageComponent} from "./component/dictionary-page/dictionary-page.component";


const routes: Routes = [
  {
    path: '',
    component: DictionaryPageComponent
  },

  {
    path:"detail/:id",
    component:DictionaryDetailPageComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
