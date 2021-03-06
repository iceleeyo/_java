# Linux
   - 基本命令
* 文件相关类命令
   + ls [option] [filepath] --- 输出目标目录下的文件
   > -a 显示所有目录(包括隐藏目录）
   > -A 显示除.,..之外的所有目录(.,..为Linux默认存在的目录 表示当前和上级目录)
   > -R 递归显示目录下的所有文
   > -l 显示文件包括权限在内的属性
   > -d 仅显示目录名
   > --file-type
   > -k 以KB为单位显示文件大小
   >
   > -i inode号
   ```
      total 4        //目录大小
      drwxr-xr-x 3 root root 4096 Jun  4 08:46 testDir
      d 目录文件 - -:普通文件 d:目录文件 l:链接文件 b:块设备文件 c:字符设备文件 p:管道文件
      rwxr-xr-x - 文件所有者，文件所属组，其他用户的读，写，执行三个权限
      3 - 该目录下的文件总数
      root- 所有者
      root - 所在组
      4096 - 字节数
      Jun  4 08:46 - 修改时间
   ```
   + cd [directory]  目录切换命令
   > ~ 表示用户主目录
   > .. 表示上级目录
   >
   > - 返回前一个目录
   + mkdir [directory] 创建文件目录
   > -p 递归创建子目录 eg. mkdir -p /dir1/dir2
   + cp [src] [des]  copy命令
   > -r 递归操作文件目录
   > -p 保留文件的原始属性
   > -i 询问是否覆盖
   > -d 保留链接文件属性
   > -a 相当于-rpd
   + mv [src] [des]  move命令
   > -r 递归操作文件目录
   > -b 若需要覆盖，则先备份
   > -S[String] 为备份文件指定后缀
   > -f 若文件或目录重复，则直接覆盖
   > -i 交互式操作，若文件重复询问是否覆盖
   + rm [src] remove命令
   > -r 递归操作文件目录
   > -f 不询问，强制删除
   > -i 交互式操作
   > -v 显示删除执行过程
   > -d 删除目录全部的硬链接
   - cat [file] 查看内容较少的纯文本文件
   > -n 显示行号
   > -b 显示行号，且忽略空白行
   - more [file] 显示行号较多的纯文本文件
   > -[number] 每屏行数
   > +[number] 从number行开始显示
   > -c 不滚屏，在同一个页面刷新内容
   > -s 多个空行压缩为一行
   - less [option] [file]
   > -e 文件内容显示完毕后自动退出
   > -N 显示行号
   > -l 搜索忽略大小写
   > -s 多行空格合并
   - head [file]   读取文件的前
   > -n [number]/-[number] 前number行，numer为负表示从末尾number+1行到开头
   > -c [number] 前number个字符
   > -v 显示文件名的头信息
   - tail [file] 读取文件后
   > -n [number] 文件后number行，numer为负时，从n行查看到末尾
   > -c [number] 文件后number字节内容
   > __-f 查看文件的更新信息__
   - wc [file] 统计file的信息
   > -l 统计文本行数 line
   > -w 统计文本单词数 word
   > -c 统计字节数
   - stat [file] 用于查看文件的具体存储和时间信息
   - cut [file] 按列查看文本文件
   > -d 指定分隔符,默认为空格 eg. -d:
   > -f 指定几行开始看 基1
   > --complement 查看指定之外的列
   - diff [file1] [file2]  对比两个文本文件
   > -c 获取两个文件的不同
   > --brief 比较两个文件是否相同
   - touch [file] 用于创建空白文件或者改变文件时间
   > -a 修改创建时间
   > -m 修改"修改"时间
   > -d 同时修改两个时间
   - file [file] 查看文件类型
   - tar 压缩打包文件
   > -c 创建压缩文件
   > -x 解压文件
   > -t 查看压缩包内的文件
   > -z 用Gzip压缩解压
   > -j 用bzip2压缩解压
   > -v 显示解压或压缩的过程
   > -f 指定压缩之后的文件名称
   > -C 解压到指定沐浴露
   > -P 使用绝对路径压缩
   - grep [options] [textfile] 文本搜索命令
   > -b 将可执行文件（二进制）作为文本（text）文件所搜
   > -c 仅显示找到的行数
   > -i 搜索时忽略大小小
   > -n 显示行号
   > -v 反向选择，列出没有key word的行
   - find [path] [options]
   > -name 匹配名称
   > -perm 匹配权限
   > -user 所有者
   > -group 所有组
* 文件隐藏属性相关
   - chattr [options] [file] 修改文件的隐藏属性
   > + 增加某隐藏属性
   > - 删除某隐藏属性
   > = 仅设置某隐藏属性

   - lsattr [options] [file] 查看文件的隐藏属性
* 系统相关
   - shutdown 关机指令
   > -r reboot
   > -F 重启时执行fsck
   > -k 仅送出消息不关机
   > -n 强行关机
   > -h [time] 指定时间关机
   - reboot 重启指令
   - echo 提取变量或输出字符
   - date 显示或修改系统时间
   - wget 终端下载网络文件
   > -b 后台下载
   > -P 下载到指定目录
   > -r 递归下载
   - ps [option] 用于查看进程状态
   > -a 查看查看所有进程
   > -u 用户以及其他详细信息
   > -x 显示没有控制终端的进程
   - pidof [mysqld] 查询某个服务进程的pid
   - kill [pid] 杀死某个进程
   - ipconfig 查看网卡信息
   - uname [-a] 查看系统内核和版本信息
   - uptime    查看系统的负载信息
   - free [-h] 查看内存使用信息
   - history 查看已经执行的命令
   > -c 清楚命令记录
* Shell相关
   - read 从终端读取一个参数
   > -p 显示的提示信息
   > -t 等待时间
   - expr 是运算表达式
   > +,-,\*,/,% --- 加减乘除取余

- - -
### 指定操作符
#### 输入输出重定向
> | 文件               | 文件描述符 |
> |-                   | -         |
> | 标准输入文件 STDIN  | 0         |
> | 标准输出文件 STDOUT | 1         |
> | 错误错误文件 STDERR | 2         |

|符号            |作用                      |
|-               |-                        |
|command > file  |标准输出重定向(覆盖写)     |
|command >> file |标准输出重定向(追加写)     |
|command 2> file |错误输出重定向(覆盖写)     |
|command 2>> file|错误输出重定向(追加写)     |
|command &>> file|标准和错误输出重定向(追加写)|
#### 管道命令符 "|"
> __将前一个命令的的标准输出当做后一个命令的标准输入__

eg.  _find -name ".vim*" | more -c 2 -[5]_

#### 命令通配符
1. \* 匹配0到多个字符
2. ? 匹配单个字符
3. [0-9] 代表0-9的数字
4. [abc] 代表a,b,c任一字符

- - -
### Shell基础
#### 判断关键字
##### 文件类判断
|操作符|作用|
|-|-|
|-d|判断文件是否为目录|
|-e|判断文件是否存在|
|-f|判断是否为一般文件|
|-r|判断当前用户是否有权限读取|
|-w|判断当前用户是否有权限写入|
|-x|判断是否具有执行权限|
##### 字符串判断
|操作符|作用|
|-|-|
|=|比较字符串是否相同|
|!=|比较字符串是否不相同|
|-z|判断字符串是否为空|
##### 整数比较运算符
|操作符|作用|
|-|-|
|-eq|等于|
|-ne|不等于|
|-gt|大于|
|-lt|小于|
|-le|小于等于|
|-ge|大于等于|

---
### Tip

1. **;**

   - 在命令行中使用`;`可以保证，多条命令从左到右顺序执行，不关心是否失败。

2. **| 管道符 **

   - `|`在两个命令之间建立一个管道，将前一个命令的输出作为下一个命令的输入

3. **& ** 
   - `&`做为启动参数放在命令最后表示以后台形式执行该命令
   - 能变相的实现**并行**执行多个命令

4. **&& 逻辑与**
   - shell 在执行某个命令的时候会返回一个返回值，该返回值保存在 shell 变量` $?` 中。当 `$? == 0` 时，表示执行成功；当`$? == 1`（maybe） 时 ，表示执行失败。
   - `&&`连接的两个命令，只有当左边命令执行成功，即`$? == 0`时右边命令才会执行

5. **|| 逻辑或**

   - `||`链接的两个命令，只有当左边命令执行失败，右边命令才会执行

6. 查看系统版本

   > lsb_release -a

7. 查看内核版本

   > uname -a
