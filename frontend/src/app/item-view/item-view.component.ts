import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-item-view',
  templateUrl: './item-view.component.html',
  styleUrls: ['./item-view.component.css']
})
export class ItemViewComponent implements OnInit {
  items = [];
  txt: any;

  constructor() {
  }

  ngOnInit(): void {
    this.getItems();
  }

  getItems() {
  }
}


