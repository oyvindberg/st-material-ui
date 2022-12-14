package com.olvind.mui.muiBase

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsClassNameConfiguratorMod {
  
  /* Inlined parent std.Partial<@mui/base.@mui/base/utils/ClassNameConfigurator.ClassNameConfiguration> */
  trait ClassNameConfiguratorProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.undefined
    
    var disableDefaultClasses: js.UndefOr[Boolean] = js.undefined
  }
  object ClassNameConfiguratorProps {
    
    inline def apply(): ClassNameConfiguratorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClassNameConfiguratorProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClassNameConfiguratorProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisableDefaultClasses(value: Boolean): Self = StObject.set(x, "disableDefaultClasses", value.asInstanceOf[js.Any])
      
      inline def setDisableDefaultClassesUndefined: Self = StObject.set(x, "disableDefaultClasses", js.undefined)
    }
  }
}
