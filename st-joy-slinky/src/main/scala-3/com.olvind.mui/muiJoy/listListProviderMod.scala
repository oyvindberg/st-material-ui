package com.olvind.mui.muiJoy

import com.olvind.mui.react.mod.PropsWithChildren
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listListProviderMod {
  
  @JSImport("@mui/joy/List/ListProvider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param0: PropsWithChildren[ListProviderProps]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  object scopedVariables {
    
    @JSImport("@mui/joy/List/ListProvider", "scopedVariables")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@mui/joy/List/ListProvider", "scopedVariables.--List-itemButton-marginBlock")
    @js.native
    def ListItemButtonMarginBlock: String = js.native
    
    inline def ListItemButtonMarginBlock_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("--List-itemButton-marginBlock")(x.asInstanceOf[js.Any])
    
    @JSImport("@mui/joy/List/ListProvider", "scopedVariables.--List-itemButton-marginInline")
    @js.native
    def ListItemButtonMarginInline: String = js.native
    
    inline def ListItemButtonMarginInline_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("--List-itemButton-marginInline")(x.asInstanceOf[js.Any])
    
    @JSImport("@mui/joy/List/ListProvider", "scopedVariables.--List-item-marginBlock")
    @js.native
    def ListItemMarginBlock: String = js.native
    
    inline def ListItemMarginBlock_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("--List-item-marginBlock")(x.asInstanceOf[js.Any])
    
    @JSImport("@mui/joy/List/ListProvider", "scopedVariables.--List-item-marginInline")
    @js.native
    def ListItemMarginInline: String = js.native
    
    inline def ListItemMarginInline_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("--List-item-marginInline")(x.asInstanceOf[js.Any])
    
    @JSImport("@mui/joy/List/ListProvider", "scopedVariables.--NestedList-item-paddingLeft")
    @js.native
    def NestedListItemPaddingLeft: String = js.native
    
    inline def NestedListItemPaddingLeft_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("--NestedList-item-paddingLeft")(x.asInstanceOf[js.Any])
    
    @JSImport("@mui/joy/List/ListProvider", "scopedVariables.--NestedList-marginLeft")
    @js.native
    def NestedListMarginLeft: String = js.native
    
    inline def NestedListMarginLeft_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("--NestedList-marginLeft")(x.asInstanceOf[js.Any])
    
    @JSImport("@mui/joy/List/ListProvider", "scopedVariables.--NestedList-marginRight")
    @js.native
    def NestedListMarginRight: String = js.native
    
    inline def NestedListMarginRight_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("--NestedList-marginRight")(x.asInstanceOf[js.Any])
  }
  
  trait ListProviderProps extends StObject {
    
    /**
      * If `undefined`, there is no effect.
      * If `true` or `false`, affects the nested List styles.
      */
    var nested: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, display the list in horizontal direction.
      * @default false
      */
    var row: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Only for horizontal list.
      * If `true`, the list sets the flex-wrap to "wrap" and adjust margin to have gap-like behavior (will move to `gap` in the future).
      *
      * @default false
      */
    var wrap: js.UndefOr[Boolean] = js.undefined
  }
  object ListProviderProps {
    
    inline def apply(): ListProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListProviderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListProviderProps] (val x: Self) extends AnyVal {
      
      inline def setNested(value: Boolean): Self = StObject.set(x, "nested", value.asInstanceOf[js.Any])
      
      inline def setNestedUndefined: Self = StObject.set(x, "nested", js.undefined)
      
      inline def setRow(value: Boolean): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
      
      inline def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
}
