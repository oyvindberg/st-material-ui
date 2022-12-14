package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Paper extends StObject {
  
  var clearIndicator: js.UndefOr[PartialIconButtonPropsdefaultComponent] = js.undefined
  
  var paper: js.UndefOr[PaperPropsdiv] = js.undefined
  
  var popper: js.UndefOr[PartialPopperPropsAbout] = js.undefined
  
  var popupIndicator: js.UndefOr[PartialIconButtonPropsdefaultComponent] = js.undefined
}
object Paper {
  
  inline def apply(): Paper = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Paper]
  }
  
  extension [Self <: Paper](x: Self) {
    
    inline def setClearIndicator(value: PartialIconButtonPropsdefaultComponent): Self = StObject.set(x, "clearIndicator", value.asInstanceOf[js.Any])
    
    inline def setClearIndicatorUndefined: Self = StObject.set(x, "clearIndicator", js.undefined)
    
    inline def setPaper(value: PaperPropsdiv): Self = StObject.set(x, "paper", value.asInstanceOf[js.Any])
    
    inline def setPaperUndefined: Self = StObject.set(x, "paper", js.undefined)
    
    inline def setPopper(value: PartialPopperPropsAbout): Self = StObject.set(x, "popper", value.asInstanceOf[js.Any])
    
    inline def setPopperUndefined: Self = StObject.set(x, "popper", js.undefined)
    
    inline def setPopupIndicator(value: PartialIconButtonPropsdefaultComponent): Self = StObject.set(x, "popupIndicator", value.asInstanceOf[js.Any])
    
    inline def setPopupIndicatorUndefined: Self = StObject.set(x, "popupIndicator", js.undefined)
  }
}
