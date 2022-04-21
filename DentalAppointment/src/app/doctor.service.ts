import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Doctor } from './doctor';

@Injectable({
  providedIn: 'root'
})
export class DoctorService {

  private baseUrl: "http://localhost:8080/admin/all"

  constructor(private httpClient: HttpClient) { }

getDoctorList(){

  return this.httpClient.get("http://localhost:8080/admin/all");
}
}
