let fn;
let f1;
let f2;
let sum;
sum = 0;
fn = 0;
f1 = 0;
f2 = 1;
sum = f1 + f2;
console.log(f1);
console.log(f2);
for (let i = 0; i <= 17; i++) {
    fn = f1 + f2;
    sum += fn;
    console.log(fn);
    f1 = f2;
    f2 = fn;
}
console.log(`Sum: ${sum}`);
//# sourceMappingURL=main.js.map