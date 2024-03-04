// maxk.service.ts

import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from '../../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class RemainderService {

  private apiUrl = environment.apiUrl + '/maxK'; // Cambiar esta URL según tu configuración

  constructor(private http: HttpClient) { }

  getMaxK(x: number, y: number, n: number): Observable<number> {
    return this.http.get<number>(`${this.apiUrl}?x=${x}&y=${y}&n=${n}`);
  }

  postMaxK(x: number, y: number, n: number): Observable<number> {
    return this.http.post<number>(this.apiUrl, { x, y, n });
  }
}
