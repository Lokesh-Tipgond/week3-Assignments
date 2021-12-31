import { Component, OnInit } from '@angular/core';
import { todo } from 'src/app/modules/todo';

@Component({
  selector: 'app-review',
  templateUrl: './review.component.html',
  styleUrls: ['./review.component.css']
})
export class ReviewComponent implements OnInit {
 todos:todo[];
 sno:number
review:string
  constructor() { 
    this.todos=[]

  }

  ngOnInit(): void {
  }
  onSubmit(){
    const todo ={
      sno:this.sno,
      review :this.review
    }

   }
   deleteTodo(todo:todo){
  console.log(todo);
  const index = this.todos.indexOf(todo);
  this.todos.splice(index,1);
  }
  addTodo(todo:todo){
    console.log(todo);
    this.todos.push(todo);
    }
}
