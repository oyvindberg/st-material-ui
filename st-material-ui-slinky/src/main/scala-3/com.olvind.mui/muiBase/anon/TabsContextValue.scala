package com.olvind.mui.muiBase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabsContextValue extends StObject {
  
  def getRootProps(): js.Object
  
  var tabsContextValue: Direction
}
object TabsContextValue {
  
  inline def apply(getRootProps: () => js.Object, tabsContextValue: Direction): TabsContextValue = {
    val __obj = js.Dynamic.literal(getRootProps = js.Any.fromFunction0(getRootProps), tabsContextValue = tabsContextValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsContextValue]
  }
  
  extension [Self <: TabsContextValue](x: Self) {
    
    inline def setGetRootProps(value: () => js.Object): Self = StObject.set(x, "getRootProps", js.Any.fromFunction0(value))
    
    inline def setTabsContextValue(value: Direction): Self = StObject.set(x, "tabsContextValue", value.asInstanceOf[js.Any])
  }
}
