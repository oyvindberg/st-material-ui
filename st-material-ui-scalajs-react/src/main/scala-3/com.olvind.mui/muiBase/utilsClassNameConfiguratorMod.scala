package com.olvind.mui.muiBase

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsClassNameConfiguratorMod {
  
  /* Inlined parent std.Partial<@mui/base.@mui/base/utils/ClassNameConfigurator.ClassNameConfiguration> */
  trait ClassNameConfiguratorProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var disableDefaultClasses: js.UndefOr[Boolean] = js.undefined
  }
  object ClassNameConfiguratorProps {
    
    inline def apply(): ClassNameConfiguratorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClassNameConfiguratorProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClassNameConfiguratorProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDisableDefaultClasses(value: Boolean): Self = StObject.set(x, "disableDefaultClasses", value.asInstanceOf[js.Any])
      
      inline def setDisableDefaultClassesUndefined: Self = StObject.set(x, "disableDefaultClasses", js.undefined)
    }
  }
}
