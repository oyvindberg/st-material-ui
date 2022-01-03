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

/* Inlined std.Pick<@mui/material.@mui/material/styles/props.ComponentsPropsList['MuiRating'], 'emptyLabelText' | 'getLabelText'> */
@js.native
trait PickComponentsPropsListMuiRatingemptyLab extends StObject {
  
  var emptyLabelText: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.native
  
  var getLabelText: js.UndefOr[js.Function1[/* value */ Double, String]] = js.native
}
object PickComponentsPropsListMuiRatingemptyLab {
  
  @scala.inline
  def apply(): PickComponentsPropsListMuiRatingemptyLab = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickComponentsPropsListMuiRatingemptyLab]
  }
  
  @scala.inline
  implicit class PickComponentsPropsListMuiRatingemptyLabMutableBuilder[Self <: PickComponentsPropsListMuiRatingemptyLab] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmptyLabelText(value: VdomNode): Self = StObject.set(x, "emptyLabelText", value.rawNode.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyLabelTextNull: Self = StObject.set(x, "emptyLabelText", null)
    
    @scala.inline
    def setEmptyLabelTextUndefined: Self = StObject.set(x, "emptyLabelText", js.undefined)
    
    @scala.inline
    def setEmptyLabelTextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "emptyLabelText", js.Array(value :_*))
    
    @scala.inline
    def setEmptyLabelTextVdomElement(value: VdomElement): Self = StObject.set(x, "emptyLabelText", value.rawElement.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetLabelText(value: /* value */ Double => String): Self = StObject.set(x, "getLabelText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetLabelTextUndefined: Self = StObject.set(x, "getLabelText", js.undefined)
  }
}
