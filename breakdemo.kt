fun main()
{
    var i=0;var j=0; var k=0;
    outerloop@ while(i<3)
    {
        j=0;
        while(j<3)
        {
            k=0;
            while(k<3)
            {
                if(k==2)
                	break@outerloop
                else 
                	println(k);
                k++;
            }
            j++;
        }
        i++;
    }
}
