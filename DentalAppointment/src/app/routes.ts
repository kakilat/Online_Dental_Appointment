import { Routes } from '@angular/router';
import { UserComponent } from './user/user.component';
import { SignUpComponent } from './user/sign-up/sign-up.component';
import { SignInComponent } from './user/sign-in/sign-in.component';
import { UserProfileComponent } from './user-profile/user-profile.component';
import { AuthGuard } from './auth/auth.guard';
import { HomeComponent } from './home/home.component';
import { DoctorsListComponent } from './doctors-list/doctors-list.component';
import { PatientComponent } from './patient/patient.component';


export const appRoutes: Routes = [
    {
        path: 'signup', component: SignUpComponent

    },
    {
        path: 'login', component: SignInComponent

    },
    {
        path: 'userprofile', component: UserProfileComponent,canActivate:[AuthGuard]
    },
    {
        path: 'home', component: HomeComponent
    },
    {
        path: 'doctors', component: DoctorsListComponent
    },
    {
      path: 'patients', component: PatientComponent
  },
    {
      path: 'signup', component: SignUpComponent
    },
    {
        path: '', redirectTo: '/home', pathMatch: 'full'
    }
];
