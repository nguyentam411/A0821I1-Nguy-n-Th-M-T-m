import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ImageGalleryRoutingModule } from './image-gallery-routing.module';
import { ImageCardComponent } from './image-card/image-card.component';


@NgModule({
  declarations: [ImageCardComponent],
  exports: [
    ImageCardComponent
  ],
  imports: [
    CommonModule,
    ImageGalleryRoutingModule,
  ]
})
export class ImageGalleryModule { }
