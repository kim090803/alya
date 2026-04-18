use std:: io;
fn alya () -> i32 {
    let mut input = String :: new();
        io:: stdin().read_line(&mut input).expect("입력실패");
        let input_2: i32 = input.trim().parse().expect("숫자만 입력");
    return input_2; }

fn main() {
    let mut max = 0;
    let mut max_wich = 0;
    for i in 1..=9 {
        let num = alya();
        if num > max {
            max = num;
            max_wich = i;
        }
    }  
    println!("{}",max);
    println!("{}",max_wich);

}