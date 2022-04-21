import { Component, OnInit } from '@angular/core';
import { Doctor } from '../doctor';
import { DoctorService } from '../doctor.service';

@Component({
  selector: 'app-doctors-list',
  templateUrl: './doctors-list.component.html',
  styleUrls: ['./doctors-list.component.css']
})
export class DoctorsListComponent implements OnInit {
doctors: any =[];
  constructor(private ser:DoctorService) {
    //console.log('hi ka');
   }

  ngOnInit(): void {
    this.getDoct();
    console.log(this.doctors.length);

  }
  private  getDoct(){
this.ser.getDoctorList().subscribe(data => {
  this.doctors = data
})

}


}

