package vlac.navi.accountkit.huawei

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.huawei.hms.common.ApiException
import com.huawei.hms.support.hwid.HuaweiIdAuthManager
import com.huawei.hms.support.hwid.request.HuaweiIdAuthParams
import com.huawei.hms.support.hwid.request.HuaweiIdAuthParamsHelper
import com.huawei.hms.support.hwid.service.HuaweiIdAuthService

class MainActivity : AppCompatActivity() {
    lateinit var authParams: HuaweiIdAuthParams
    lateinit var service: HuaweiIdAuthService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        authParams = HuaweiIdAuthParamsHelper(HuaweiIdAuthParams.DEFAULT_AUTH_REQUEST_PARAM).setIdToken().createParams()
        service = HuaweiIdAuthManager.getService(this@MainActivity, authParams)
        startActivityForResult(service.signInIntent, 8888)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 8888) {
            val authHuaweiIdTask = HuaweiIdAuthManager.parseAuthResultFromIntent(data)

            if (authHuaweiIdTask.isSuccessful) {
                val huaweiAccount = authHuaweiIdTask.result
                Log.i("TAG", "token: " + huaweiAccount.idToken)
            } else {
                Log.e("TAG", (authHuaweiIdTask.exception as ApiException).statusCode.toString())
            }
        }
    }
}