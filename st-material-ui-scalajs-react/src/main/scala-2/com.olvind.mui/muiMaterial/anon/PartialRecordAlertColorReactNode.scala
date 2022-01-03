package com.olvind.mui.muiMaterial.anon

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<Record<AlertColor, ReactNode>> */
@js.native
trait PartialRecordAlertColorReactNode extends StObject {
  
  var error: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.native
  
  var info: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.native
  
  var success: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.native
  
  var warning: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.native
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
    def setError(value: VdomNode): Self = StObject.set(x, "error", value.rawNode.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorNull: Self = StObject.set(x, "error", null)
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setErrorVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "error", js.Array(value :_*))
    
    @scala.inline
    def setErrorVdomElement(value: VdomElement): Self = StObject.set(x, "error", value.rawElement.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfo(value: VdomNode): Self = StObject.set(x, "info", value.rawNode.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoNull: Self = StObject.set(x, "info", null)
    
    @scala.inline
    def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    @scala.inline
    def setInfoVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "info", js.Array(value :_*))
    
    @scala.inline
    def setInfoVdomElement(value: VdomElement): Self = StObject.set(x, "info", value.rawElement.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: VdomNode): Self = StObject.set(x, "success", value.rawNode.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessNull: Self = StObject.set(x, "success", null)
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setSuccessVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "success", js.Array(value :_*))
    
    @scala.inline
    def setSuccessVdomElement(value: VdomElement): Self = StObject.set(x, "success", value.rawElement.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarning(value: VdomNode): Self = StObject.set(x, "warning", value.rawNode.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningNull: Self = StObject.set(x, "warning", null)
    
    @scala.inline
    def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
    
    @scala.inline
    def setWarningVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "warning", js.Array(value :_*))
    
    @scala.inline
    def setWarningVdomElement(value: VdomElement): Self = StObject.set(x, "warning", value.rawElement.asInstanceOf[js.Any])
  }
}
