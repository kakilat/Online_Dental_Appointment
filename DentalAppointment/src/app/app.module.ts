import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import{HttpClientModule} from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NewClientComponent } from './new-client/new-client.component';
import { AllClientsComponent } from './all-clients/all-clients.component';
import { DoctorsListComponent } from './doctors-list/doctors-list.component';
import { SignInComponent } from './user/sign-in/sign-in.component';
import { HomeComponent } from './home/home.component';
import { SignUpComponent } from './user/sign-up/sign-up.component';
import { appRoutes } from './routes';
import { RouterModule } from '@angular/router';
import { PatientComponent } from './patient/patient.component';

@NgModule({
  declarations: [
    AppComponent,
    NewClientComponent,
    AllClientsComponent,
    DoctorsListComponent,
    SignUpComponent,
    SignInComponent,
    HomeComponent,
    PatientComponent

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule.forRoot(appRoutes),
    HttpClientModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
