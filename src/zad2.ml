let sublist list element length =
  let rec sublist_rec xs el len res =
    match xs with
      h::t when res=[] && h=el -> sublist_rec (List.tl xs) el (len-1) (el::res)
     |[] -> res
     |_ when len=0 -> res
     |_ when len>0 && res<>[] -> sublist_rec (List.tl xs) el (len-1) ((List.hd xs)::res)
     |_ -> sublist_rec (List.tl xs) el len res
  in List.rev (sublist_rec list element length []);;

sublist [1;2;3;4;5;6;7;8;9] 10 10;;
