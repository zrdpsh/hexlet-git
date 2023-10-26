def cartesian[I, J] (p:Seq[I], q:Seq[J]) = p.map(x=> q.map(y => (x,y)))
