package com.olvind.mui.muiMaterial.anon

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Popper extends StObject {
  
  var Arrow: js.UndefOr[ElementType] = js.native
  
  var Popper: js.UndefOr[ElementType] = js.native
  
  var Tooltip: js.UndefOr[ElementType] = js.native
  
  var Transition: js.UndefOr[ElementType] = js.native
}
object Popper {
  
  @scala.inline
  def apply(): Popper = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Popper]
  }
  
  @scala.inline
  implicit class PopperMutableBuilder[Self <: Popper] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArrow(value: ElementType): Self = StObject.set(x, "Arrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrowUndefined: Self = StObject.set(x, "Arrow", js.undefined)
    
    @scala.inline
    def setPopper(value: ElementType): Self = StObject.set(x, "Popper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopperUndefined: Self = StObject.set(x, "Popper", js.undefined)
    
    @scala.inline
    def setTooltip(value: ElementType): Self = StObject.set(x, "Tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "Tooltip", js.undefined)
    
    @scala.inline
    def setTransition(value: ElementType): Self = StObject.set(x, "Transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionUndefined: Self = StObject.set(x, "Transition", js.undefined)
  }
}
