// maxk.component.ts

import { Component } from '@angular/core';
import { RemainderService } from './remainder.service';

@Component({
  selector: 'app-remainder',
  templateUrl: './remainder.component.html',
  styleUrls: ['./remainder.component.css']
})
export class RemainderComponent {

  x: number = 0;
  y: number = 0;
  n: number = 0;
  result: number = 0;

  constructor(private RemainderService: RemainderService) { }

  getMaxK(): void {
    this.result = 0;
    this.RemainderService.getMaxK(this.x, this.y, this.n).subscribe(
      result => this.result = result,
      error => console.error('Error fetching maxK:', error)
    );
  }

  postMaxK(): void {
      this.result = 0;
    this.RemainderService.postMaxK(this.x, this.y, this.n).subscribe(
      result => this.result = result,
      error => console.error('Error fetching maxK:', error)
    );
  }
}
