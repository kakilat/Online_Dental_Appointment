import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-patient',
  templateUrl: './patient.component.html',
  styleUrls: ['./patient.component.css']
})
export class PatientComponent implements OnInit {

  users = [
    { firstName: 'Frank', lastName: 'Murphy', email: 'frank.murphy@test.com', role: '11/12/12' },
    { firstName: 'Vic', lastName: 'Reynolds', email: 'vic.reynolds@test.com', role: '11/12/12' },
    { firstName: 'Gina', lastName: 'Jabowski', email: 'gina.jabowski@test.com', role: '11/12/12' },
    { firstName: 'Jessi', lastName: 'Glaser', email: 'jessi.glaser@test.com', role: '11/12/12' },
    { firstName: 'Jay', lastName: 'Bilzerian', email: 'jay.bilzerian@test.com', role: '11/12/12' }
];

  constructor() { }

  ngOnInit(): void {
  }

}
