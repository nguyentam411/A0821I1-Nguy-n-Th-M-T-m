import {Injectable} from '@angular/core';
import {IWord} from "../model/IWord";

@Injectable({
  providedIn: 'root'
})
export class DictionaryService {
  words: IWord[] = [{
    id:1,
    word:'blue',
    mean:'màu xanh dương'
  },
    {
      id:2,
      word:'red',
      mean:'màu đỏ'
    },
    {
      id:3,
      word:'yellow',
      mean:'màu vàng'
    }]

  constructor() {
  }
  getAll(){
    return this.words;
  }
  findById(id:number){
    for(let word of this.words) {
      if(word.id == id) {
        return word
      }
    }
  }
  detail(id:number){
    this.words=this.words.filter(word=>{
      return word.id!==id;
    })
  }
}
