.assembly extern mscorlib {}
.assembly sample02{}
.module sample02.exe
.class public _Principal{
.method static public void _principal()
{ .entrypoint
.locals(int64 lado)
.locals(int64 _area)
call string [mscorlib]System.Console::ReadLine()
call int64 [mscorlib]System.Int64::Parse(string)
stloc lado
ldloc lado
ldloc lado
mul
stloc _area
ldloc _area
call void [mscorlib]System.Console::Write(int64)
ret
}
}
