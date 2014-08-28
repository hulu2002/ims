SELECT b_in.id,b_in.catno,b_in.catName,b_in.batchNo,b_in.inDate,b_in.inDate as builtdate,CONCAT(date_format(b_in.inDate,'%Y-%c-%d') ,'新入库',b_in.num,'个',b_in.batchno,'的',b_in.catname) description FROM b_in ,b_var WHERE DATEDIFF(current_date(),b_in.inDate) <= b_var.bizValue and  DATEDIFF(current_date(),b_in.inDate)>=0 and b_var.bizkey='banchTime' ORDER BY b_in.inDate DESC