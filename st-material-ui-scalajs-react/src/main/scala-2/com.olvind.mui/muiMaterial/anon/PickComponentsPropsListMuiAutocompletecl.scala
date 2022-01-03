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

/* Inlined std.Pick<@mui/material.@mui/material/styles/props.ComponentsPropsList['MuiAutocomplete'], 'clearText' | 'closeText' | 'loadingText' | 'noOptionsText' | 'openText'> */
@js.native
trait PickComponentsPropsListMuiAutocompletecl extends StObject {
  
  var clearText: js.UndefOr[String] = js.native
  
  var closeText: js.UndefOr[String] = js.native
  
  var loadingText: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.native
  
  var noOptionsText: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.native
  
  var openText: js.UndefOr[String] = js.native
}
object PickComponentsPropsListMuiAutocompletecl {
  
  @scala.inline
  def apply(): PickComponentsPropsListMuiAutocompletecl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickComponentsPropsListMuiAutocompletecl]
  }
  
  @scala.inline
  implicit class PickComponentsPropsListMuiAutocompleteclMutableBuilder[Self <: PickComponentsPropsListMuiAutocompletecl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClearText(value: String): Self = StObject.set(x, "clearText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearTextUndefined: Self = StObject.set(x, "clearText", js.undefined)
    
    @scala.inline
    def setCloseText(value: String): Self = StObject.set(x, "closeText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseTextUndefined: Self = StObject.set(x, "closeText", js.undefined)
    
    @scala.inline
    def setLoadingText(value: VdomNode): Self = StObject.set(x, "loadingText", value.rawNode.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingTextNull: Self = StObject.set(x, "loadingText", null)
    
    @scala.inline
    def setLoadingTextUndefined: Self = StObject.set(x, "loadingText", js.undefined)
    
    @scala.inline
    def setLoadingTextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "loadingText", js.Array(value :_*))
    
    @scala.inline
    def setLoadingTextVdomElement(value: VdomElement): Self = StObject.set(x, "loadingText", value.rawElement.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoOptionsText(value: VdomNode): Self = StObject.set(x, "noOptionsText", value.rawNode.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoOptionsTextNull: Self = StObject.set(x, "noOptionsText", null)
    
    @scala.inline
    def setNoOptionsTextUndefined: Self = StObject.set(x, "noOptionsText", js.undefined)
    
    @scala.inline
    def setNoOptionsTextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "noOptionsText", js.Array(value :_*))
    
    @scala.inline
    def setNoOptionsTextVdomElement(value: VdomElement): Self = StObject.set(x, "noOptionsText", value.rawElement.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenText(value: String): Self = StObject.set(x, "openText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenTextUndefined: Self = StObject.set(x, "openText", js.undefined)
  }
}
