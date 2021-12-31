import { Component, OnInit ,EventEmitter,Output} from '@angular/core';
import {todo } from "src/app/modules/todo";

@Component({
  selector: 'app-add-review',
  templateUrl: './add-review.component.html',
  styleUrls: ['./add-review.component.css']
})
export class AddReviewComponent implements OnInit {
 review:string
 rating:number 
 @Output() todoAdd : EventEmitter<todo> = new EventEmitter();

 
  constructor() { }

  ngOnInit(): void {
  }
  onSubmit() {
    const todo = {
      rating:this.rating,
      review:this.review
     }
     this.todoAdd.emit(todo);
     this.review="";
     this.rating=0;

   }
}
