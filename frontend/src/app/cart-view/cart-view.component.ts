import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-cart-view',
  templateUrl: './cart-view.component.html',
  styleUrls: ['./cart-view.component.css']
})
export class CartViewComponent implements OnInit {
  cartDetails: any;
  description: 'abcd' | undefined;
  quantity: 23 | undefined;

  constructor() { }

  ngOnInit(): void {
  }

}
