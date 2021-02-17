import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CockpitComponent } from './cockpit/cockpit.component';

const routes: Routes = [
  { path: '', component: CockpitComponent },
  { path: 'cockpit', component: CockpitComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
