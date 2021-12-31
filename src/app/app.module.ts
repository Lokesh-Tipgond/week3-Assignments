import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ReviewComponent } from './myComponents/review/review.component';
import { ReviewItemsComponent } from './myComponents/review-items/review-items.component';
import { AddReviewComponent } from './myComponents/add-review/add-review.component';

@NgModule({
  declarations: [
    AppComponent,
    ReviewComponent,
    ReviewItemsComponent,
    AddReviewComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
