import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup} from "@angular/forms";
import {DictionaryService} from "../../service/dictionary.service";
import {ActivatedRoute, ParamMap, Router} from "@angular/router";
import {IWord} from "../../model/IWord";

@Component({
  selector: 'app-dictionary-detail-page',
  templateUrl: './dictionary-detail-page.component.html',
  styleUrls: ['./dictionary-detail-page.component.css']
})
export class DictionaryDetailPageComponent implements OnInit {
  word: IWord;
  id: number;

  constructor(private dictionaryService: DictionaryService,
              private activatedRoute: ActivatedRoute,
              private router: Router) {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      const id = paramMap.get('id');
      const word = this.getWord(this.id);
      console.log(name)
      this.word = this.dictionaryService.findById(parseInt(id));
    });

  }

  ngOnInit(): void {
  }

  getWord(id: number) {
    return this.dictionaryService.findById(id);
  }
  detail(id:number){
    this.dictionaryService.findById(id);
    this.router.navigateByUrl("")
  }
}
