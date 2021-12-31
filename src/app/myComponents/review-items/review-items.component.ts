import { Component, OnInit,Input, Output } from '@angular/core';
import { todo } from 'src/app/modules/todo';
import { EventEmitter } from '@angular/core';

@Component({
  selector: 'app-review-items',
  templateUrl: './review-items.component.html',
  styleUrls: ['./review-items.component.css']
})
export class ReviewItemsComponent implements OnInit {
@Input() todo:todo;
@Output() todoDelete : EventEmitter<todo> = new EventEmitter();
  constructor() { }

  ngOnInit(): void {
  }
  onClick(todo:todo) { 
this.todoDelete.emit(todo);
    console.log("delete button trigger");
  }

}
