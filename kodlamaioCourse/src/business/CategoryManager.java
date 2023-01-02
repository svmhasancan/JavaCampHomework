package business;

import core.ILogger;
import dataAccess.ICategoryDao;
import entities.Category;

public class CategoryManager {
        private ILogger[] loggers;
        private ICategoryDao categoryDao;

        public CategoryManager(ILogger[] loggers , ICategoryDao categoryDao){
            this.loggers = loggers;
            this.categoryDao = categoryDao;
        }

        public void add(Category category) throws Exception {
            Category[] categories = {
                    new Category(1,"Web Programming"),
                    new Category(2,"Cyber Security")
            };

            for(Category category1:categories){
                if(category.getName() == category1.getName()){
                    throw new Exception("Bu Kategori Zaten Mevcut!");
                }
            }

            categoryDao.add(category);

            for(ILogger logger:loggers){
                logger.log("Save Category");
            }
        }
}
