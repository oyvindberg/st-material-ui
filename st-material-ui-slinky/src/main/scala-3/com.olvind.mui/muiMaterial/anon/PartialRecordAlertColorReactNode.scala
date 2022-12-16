package com.olvind.mui.muiMaterial.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<Record<AlertColor, ReactNode>> */
trait PartialRecordAlertColorReactNode extends StObject {
  
  var error: js.UndefOr[ReactElement] = js.undefined
  
  var info: js.UndefOr[ReactElement] = js.undefined
  
  var success: js.UndefOr[ReactElement] = js.undefined
  
  var warning: js.UndefOr[ReactElement] = js.undefined
}
object PartialRecordAlertColorReactNode {
  
  inline def apply(): PartialRecordAlertColorReactNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRecordAlertColorReactNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialRecordAlertColorReactNode] (val x: Self) extends AnyVal {
    
    inline def setError(value: ReactElement): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setInfo(value: ReactElement): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    inline def setSuccess(value: ReactElement): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setWarning(value: ReactElement): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
