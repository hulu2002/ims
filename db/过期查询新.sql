SELECT id,b.catno,b.catname,b.batchno,b.total,b.expiredate as builtdate,CONCAT(b.total,'个',b.batchno,'还剩',cast(DATEDIFF(b.expiredate,current_date()) as char(12)),'天过期！(',b.catname,')') description FROM b_cat b,b_var v where v.bizkey='expireTime' and DATEDIFF(b.expiredate,current_date())<=v.bizValue and DATEDIFF(b.expiredate,current_date())>=0 and  b.total>0 ORDER BY b.expiredate ASC