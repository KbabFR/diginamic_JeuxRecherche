import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Child } from '../models/child.model';
import { Jeu } from '../models/jeu.model';

const baseUrl = 'http://localhost:8080/rest/jeu'

@Injectable({
  providedIn: 'root'
})
export class JeuService {

  constructor(private http: HttpClient) { }
  
  getAll(): Observable<Jeu[]> {
    return this.http.get<Jeu[]>(baseUrl);
  }

  get(id: any): Observable<Jeu> {
    return this.http.get<Jeu>(`${baseUrl}/${id}`);
  }

  /*
  getResearch(data: any): Observable<Jeu[]> {
    return this.http.get<Jeu[]>(`${baseUrl}/search`, data);
  }
  */

  create(data: any): Observable<any> {
    return this.http.post(baseUrl, data);
  }

  update(id: any, data: any): Observable<any> {
    return this.http.put(`${baseUrl}/${id}`, data);
  }

  delete(id: any): Observable<any> {
    return this.http.delete(`${baseUrl}/${id}`);
  }

  deleteAll(): Observable<any> {
    return this.http.delete(baseUrl);
  }
}
