package com.olvind.mui.muiMaterial.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<Record<AlertColor, ReactNode>> */
@js.native
trait PartialRecordAlertColorReactNode extends StObject {
  
  var error: js.UndefOr[ReactElement] = js.native
  
  var info: js.UndefOr[ReactElement] = js.native
  
  var success: js.UndefOr[ReactElement] = js.native
  
  var warning: js.UndefOr[ReactElement] = js.native
}
object PartialRecordAlertColorReactNode {
  
  @scala.inline
  def apply(): PartialRecordAlertColorReactNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRecordAlertColorReactNode]
  }
  
  @scala.inline
  implicit class PartialRecordAlertColorReactNodeMutableBuilder[Self <: PartialRecordAlertColorReactNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: ReactElement): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setInfo(value: ReactElement): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    @scala.inline
    def setSuccess(value: ReactElement): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setWarning(value: ReactElement): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
