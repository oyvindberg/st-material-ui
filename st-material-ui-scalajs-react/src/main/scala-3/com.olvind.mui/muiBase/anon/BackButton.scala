package com.olvind.mui.muiBase.anon

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackButton extends StObject {
  
  var backButton: js.UndefOr[ElementType] = js.undefined
  
  var backPageIcon: js.UndefOr[ElementType] = js.undefined
  
  var firstButton: js.UndefOr[ElementType] = js.undefined
  
  var firstPageIcon: js.UndefOr[ElementType] = js.undefined
  
  var lastButton: js.UndefOr[ElementType] = js.undefined
  
  var lastPageIcon: js.UndefOr[ElementType] = js.undefined
  
  var nextButton: js.UndefOr[ElementType] = js.undefined
  
  var nextPageIcon: js.UndefOr[ElementType] = js.undefined
  
  var root: js.UndefOr[ElementType] = js.undefined
}
object BackButton {
  
  inline def apply(): BackButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackButton]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackButton] (val x: Self) extends AnyVal {
    
    inline def setBackButton(value: ElementType): Self = StObject.set(x, "backButton", value.asInstanceOf[js.Any])
    
    inline def setBackButtonUndefined: Self = StObject.set(x, "backButton", js.undefined)
    
    inline def setBackPageIcon(value: ElementType): Self = StObject.set(x, "backPageIcon", value.asInstanceOf[js.Any])
    
    inline def setBackPageIconUndefined: Self = StObject.set(x, "backPageIcon", js.undefined)
    
    inline def setFirstButton(value: ElementType): Self = StObject.set(x, "firstButton", value.asInstanceOf[js.Any])
    
    inline def setFirstButtonUndefined: Self = StObject.set(x, "firstButton", js.undefined)
    
    inline def setFirstPageIcon(value: ElementType): Self = StObject.set(x, "firstPageIcon", value.asInstanceOf[js.Any])
    
    inline def setFirstPageIconUndefined: Self = StObject.set(x, "firstPageIcon", js.undefined)
    
    inline def setLastButton(value: ElementType): Self = StObject.set(x, "lastButton", value.asInstanceOf[js.Any])
    
    inline def setLastButtonUndefined: Self = StObject.set(x, "lastButton", js.undefined)
    
    inline def setLastPageIcon(value: ElementType): Self = StObject.set(x, "lastPageIcon", value.asInstanceOf[js.Any])
    
    inline def setLastPageIconUndefined: Self = StObject.set(x, "lastPageIcon", js.undefined)
    
    inline def setNextButton(value: ElementType): Self = StObject.set(x, "nextButton", value.asInstanceOf[js.Any])
    
    inline def setNextButtonUndefined: Self = StObject.set(x, "nextButton", js.undefined)
    
    inline def setNextPageIcon(value: ElementType): Self = StObject.set(x, "nextPageIcon", value.asInstanceOf[js.Any])
    
    inline def setNextPageIconUndefined: Self = StObject.set(x, "nextPageIcon", js.undefined)
    
    inline def setRoot(value: ElementType): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
