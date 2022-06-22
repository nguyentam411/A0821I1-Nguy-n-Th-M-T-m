let fn : number;
let f1 : number;
let f2 : number;
let sum: number;
sum=0;
fn=0;
f1=0;
f2=1;
sum=f1+f2;
console.log(f1);
console.log(f2);
for (let i=0; i<=17;i++){
    fn=f1+f2;
    sum+=fn;
    console.log(fn);
    f1=f2;
    f2=fn;
}
console.log(`Sum: ${sum}`);
