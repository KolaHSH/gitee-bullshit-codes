
using System.Collections.Generic;
using System.Linq;

namespace Microsoft.Fawvw.HR.Platform.Api.Controllers
{
    public class ListInstall
    {
        /// <summary>
        /// ��ʦ������һ�д����һ��List<List<string>>��ʼ��2������ ��˼ڤ������������һ�д���
        /// </summary>
        public ListInstall()
        {
            List<List<string>> list = new List<List<string>>(new List<string>[2].Select(p => new List<string>()));
        }
    }
}