package com.olvind.mui.muiMaterial.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@mui/material.@mui/material/styles/props.ComponentsPropsList['MuiRating'], 'emptyLabelText' | 'getLabelText'> */
@js.native
trait PickComponentsPropsListMuiRatingemptyLab extends StObject {
  
  var emptyLabelText: js.UndefOr[ReactElement] = js.native
  
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
    def setEmptyLabelText(value: ReactElement): Self = StObject.set(x, "emptyLabelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyLabelTextUndefined: Self = StObject.set(x, "emptyLabelText", js.undefined)
    
    @scala.inline
    def setGetLabelText(value: /* value */ Double => String): Self = StObject.set(x, "getLabelText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetLabelTextUndefined: Self = StObject.set(x, "getLabelText", js.undefined)
  }
}
